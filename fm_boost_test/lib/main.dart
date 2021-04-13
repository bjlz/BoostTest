import 'package:flutter/material.dart';

import 'package:flutter_boost/flutter_boost_app.dart';

import 'page_first.dart';
import 'page_second.dart';

void main() => runApp(MainApp());

class MainApp extends StatefulWidget {
  @override
  _MainAppState createState() => _MainAppState();
}

class _MainAppState extends State<MainApp> {
  static final Map<String, FlutterBoostRouteFactory> _routeMap = {
    'flutter_first': (settings, uniqueId) => PageRouteBuilder(
      settings: settings,
      pageBuilder: (_, __, ___) => FirstPage(),
    ),
    'flutter_second': (settings, uniqueId) => PageRouteBuilder(
      settings: settings,
      pageBuilder: (_, __, ___) => SecondPage(),
    ),
  };

  Route<dynamic> _routeFactory(RouteSettings settings, String uniqueId) {
    FlutterBoostRouteFactory genRoute = _routeMap[settings.name];
    if (genRoute == null) return null;
    return genRoute(settings, uniqueId);
  }

  @override
  Widget build(BuildContext context) {
    return FlutterBoostApp(_routeFactory);
  }
}