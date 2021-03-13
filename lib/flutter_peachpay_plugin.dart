import 'dart:async';

import 'package:flutter/services.dart';

class PaymentGatewayPlugin {
  static const MethodChannel _channel =
  const MethodChannel('flutter_peachpay_plugin');

  static Future<String>  checkoutActitvity(String checkoutid, String method) async {
    final String version = await _channel.invokeMethod('checkoutActivity',{"checkoutid":checkoutid, "method":method});
    return version;
  }
}
