import 'package:flutter/material.dart';
import 'screens/home_screens.dart';

void main() {
  runApp(BrainSharpeningApp());
}

class BrainSharpeningApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Brain Sharpening Games',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: HomeScreen(),
    );
  }
}

