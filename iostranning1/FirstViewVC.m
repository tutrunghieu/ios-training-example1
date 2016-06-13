//
//  FirstViewVC.m
//  iostranning1
//
//  Created by hilbert tu on 6/13/16.
//  Copyright © 2016 silkroadpacific. All rights reserved.
//

#import "FirstViewVC.h"

@interface FirstViewVC ()

@end

@implementation FirstViewVC
- (IBAction)back_Click:(UIButton *)sender {
    NSLog(@"Back to ");
[self dismissViewControllerAnimated:YES completion:^{}];
}

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view from its nib.
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
