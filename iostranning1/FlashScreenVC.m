//
//  FlashScreenVC.m
//  iostranning1
//
//  Created by hilbert tu on 6/13/16.
//  Copyright © 2016 silkroadpacific. All rights reserved.
//

#import "FlashScreenVC.h"
#include "FirstViewVC.h"

@interface FlashScreenVC ()

@end

@implementation FlashScreenVC
- (IBAction)button1_Click:(UIButton *)sender
{
    NSLog(@"button pressed!");
    
   FirstViewVC* lessonVC = [[FirstViewVC alloc] init];
    lessonVC.modalTransitionStyle = UIModalTransitionStyleCrossDissolve;
    [self presentViewController:lessonVC animated:YES completion:^{}];

    
}

- (IBAction)button2_Click:(UIButton *)sender {
    NSLog(@"button 2 pressed!");

}


- (void)viewDidLoad {
    [super viewDidLoad];
    NSLog(@"FlashScreen: view loaded");

}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

/*
#pragma mark - Navigation

// In a storyboard-based application, you will often want to do a little preparation before navigation
- (void)prepareForSegue:(UIStoryboardSegue *)segue sender:(id)sender {
    // Get the new view controller using [segue destinationViewController].
    // Pass the selected object to the new view controller.
}
*/

@end
