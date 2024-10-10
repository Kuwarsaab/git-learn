import 'package:flutter/material.dart';
import 'package:flutter_chess_board/flutter_chess_board.dart';




//v3
class ChessScreen extends StatefulWidget {
  @override
  _ChessScreenState createState() => _ChessScreenState();
}

class _ChessScreenState extends State<ChessScreen> {
  ChessBoardController controller = ChessBoardController();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Chess Game'),
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
              child: Center(
                child: ChessBoard(
                  controller: controller,
                  boardColor: BoardColor.brown,
                  boardOrientation: PlayerColor.white,
                  enableUserMoves: true,
                  onMove: () {
                    if (_checkGameOver()) {
                      _showWinDialog();
                    }
                  },
                ),
              ),
            ),
          ],
        ),
      ),
    );
  }

  bool _checkGameOver() {
    return controller.game.in_checkmate || controller.game.in_stalemate;
  }

  void _showWinDialog() {
    showDialog(
      context: context,
      builder: (context) => AlertDialog(
        title: Text(controller.game.in_checkmate ? 'Checkmate!' : 'Stalemate!'),
        content: Text(controller.game.in_checkmate
            ? 'You have won the game.'
            : 'The game ended in a stalemate.'),
        actions: [
          TextButton(
            onPressed: () {
              Navigator.of(context).pop();
            },
            child: Text('OK'),
          ),
        ],
      ),
    );
  }
}