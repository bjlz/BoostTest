import 'package:flutter/material.dart';

import 'package:flutter_boost/boost_navigator.dart';

class FirstPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Flutter页面 1'),
      ),
      body: Center(
        child: Column(
          mainAxisSize: MainAxisSize.min,
          children: [
            Text('这是第一个Flutter页面'),
            TextButton(
              child: Text('跳转第二个Flutter页面'),
              onPressed: () {
                BoostNavigator.of().push(
                  'flutter_second',
                  arguments: {
                    'animated': true,
                  },
                  withContainer: true,
                );
              },
            ),
          ],
        ),
      ),
    );
  }
}
