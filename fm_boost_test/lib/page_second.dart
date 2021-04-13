import 'package:flutter/material.dart';

class SecondPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Flutter页面 2'),
      ),
      body: Center(
        child: Text('这是第二个Flutter页面'),
      ),
    );
  }
}
