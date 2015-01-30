#import "HWPAmeyaNaik.h"

@implementation HWPAmeyaNaik

- (void)getAmeya:(CDVInvokedUrlCommand*)command
{

    NSString* callbackId = [command callbackId];
    NSString* name = [[command arguments] objectAtIndex:0];
    NSString* msg = [NSString stringWithFormat: @"Hello, %@ -- by Ameya Naik", name];

    CDVPluginResult* result = [CDVPluginResult
                               resultWithStatus:CDVCommandStatus_OK
                               messageAsString:msg];

    [self success:result callbackId:callbackId];
}

@end