
import 'package:flutter/material.dart';
import 'package:sudoku_solver_generator/sudoku_solver_generator.dart';


class SudokuScreen extends StatefulWidget {
  @override
  _SudokuScreenState createState() => _SudokuScreenState();
}

class _SudokuScreenState extends State<SudokuScreen> {
  List<List<int>> sudokuGrid = SudokuGenerator().newSudoku;
  late List<List<int>> solvedSudoku;
  int selectedRow = -1;
  int selectedCol = -1;
  int mistakesMade = 0;
  static const int maxMistakes = 3;

  @override
  void initState() {
    super.initState();
    solvedSudoku = SudokuSolver.solve(sudokuGrid); // Get the solved version of the puzzle
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Sudoku Game'),
      ),
      body: Container(
        decoration: BoxDecoration(
          gradient: LinearGradient(
            begin: Alignment.topCenter,
            end: Alignment.bottomCenter,
            colors: [Colors.indigoAccent.withOpacity(0.2), Colors.indigo.withOpacity(0.8)],
          ),
        ),
        child: Column(
          children: [
            Expanded(
              child: Padding(
                padding: const EdgeInsets.all(16.0),
                child: GridView.builder(
                  itemCount: 81,
                  gridDelegate: SliverGridDelegateWithFixedCrossAxisCount(
                    crossAxisCount: 9,
                  ),
                  itemBuilder: (context, index) {
                    int row = index ~/ 9;
                    int col = index % 9;
                    bool isSelected = selectedRow == row && selectedCol == col;

                    return GestureDetector(
                      onTap: () {
                        setState(() {
                          selectedRow = row;
                          selectedCol = col;
                        });
                      },
                      child: Container(
                        decoration: BoxDecoration(
                          border: Border.all(color: Colors.white),
                          color: isSelected ? Colors.blue[100] : Colors.white,
                        ),
                        child: Center(
                          child: Text(
                            sudokuGrid[row][col] == 0
                                ? ''
                                : sudokuGrid[row][col].toString(),
                            style: TextStyle(fontSize: 20, color: Colors.black),
                          ),
                        ),
                      ),
                    );
                  },
                ),
              ),
            ),
            _buildNumberButtons(),
            Padding(
              padding: const EdgeInsets.all(8.0),
              child: Text(
                'Mistakes: $mistakesMade / $maxMistakes',
                style: TextStyle(fontSize: 18, color: Colors.white),
              ),
            ),
          ],
        ),
      ),
    );
  }

  Widget _buildNumberButtons() {
    return Container(
      color: Colors.transparent,
      padding: EdgeInsets.all(8.0),
      child: Wrap(
        alignment: WrapAlignment.center,
        spacing: 8.0,
        runSpacing: 8.0,
        children: List.generate(9, (index) {
          int number = index + 1;
          return ElevatedButton(
            onPressed: () {
              if (selectedRow != -1 && selectedCol != -1) {
                if (sudokuGrid[selectedRow][selectedCol] == 0) {
                  _handleNumberInput(number);
                }
              }
            },
            style: ElevatedButton.styleFrom(
              backgroundColor: Colors.deepPurple,
              padding: EdgeInsets.symmetric(horizontal: 20, vertical: 10),
              textStyle: TextStyle(fontSize: 20,color: Colors.white,fontWeight: FontWeight.bold),
            ),
            child: Text(number.toString(),style: TextStyle(fontSize: 20,color: Colors.white,fontWeight: FontWeight.bold),),
          );
        }),
      ),
    );
  }

  void _handleNumberInput(int number) {
    setState(() {
      if (solvedSudoku[selectedRow][selectedCol] == number) {
        sudokuGrid[selectedRow][selectedCol] = number;
        if (_checkWin()) {
          _showWinDialog();
        }
      } else {
        mistakesMade++;
        if (mistakesMade >= maxMistakes) {
          _showGameOverDialog();
        }
      }
    });
  }

  bool _checkWin() {
    for (int row = 0; row < 9; row++) {
      for (int col = 0; col < 9; col++) {
        if (sudokuGrid[row][col] == 0) {
          return false;
        }
      }
    }
    return true;
  }

  void _showWinDialog() {
    showDialog(
      context: context,
      builder: (context) => AlertDialog(
        title: Text('You Win!'),
        content: Text('Congratulations, you solved the Sudoku!'),
        actions: [
          TextButton(
            onPressed: () {
              Navigator.of(context).pop();
              _restartGame();
            },
            child: Text('Restart'),
          ),
        ],
      ),
    );
  }

  void _showGameOverDialog() {
    showDialog(
      context: context,
      builder: (context) => AlertDialog(
        title: Text('Game Over'),
        content: Text('Sorry, you made 3 mistakes. The game will restart.'),
        actions: [
          TextButton(
            onPressed: () {
              Navigator.of(context).pop();
              _restartGame();
            },
            child: Text('Restart'),
          ),
        ],
      ),
    );
  }

  void _restartGame() {
    setState(() {
      sudokuGrid = SudokuGenerator().newSudoku;
      solvedSudoku = SudokuSolver.solve(sudokuGrid);
      selectedRow = -1;
      selectedCol = -1;
      mistakesMade = 0;
    });
  }
}