#import "BookDateVC.h"
#import "HeaderBarCell.h"
#import "DefaultDataCell.h"
#import "BookLocationVC.h"

@interface BookDateVC () <UITableViewDelegate,UITableViewDataSource,UITextFieldDelegate>
@property (weak, nonatomic) IBOutlet UITableView *mainView;

@end

@implementation BookDateVC

- (void)viewDidLoad
{
    [super viewDidLoad];
    
    [self.mainView setHidden:NO];
    [self.mainView setDataSource:self];
    [self.mainView setDelegate:self];
    
    [self.mainView registerNib:[UINib nibWithNibName:@"HeaderBarCell" bundle:[NSBundle mainBundle]]
         forCellReuseIdentifier:@"ID_HeaderBarCell"];

    [self.mainView registerNib:[UINib nibWithNibName:@"DefaultDataCell" bundle:[NSBundle mainBundle]]
        forCellReuseIdentifier:@"ID_DefaultDataCell"];

    
    [self.mainView reloadData];
}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
}


- (NSInteger)numberOfSectionsInTableView:(UITableView *)tableView
{
    return 1;
}

- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section
{
    return 4;
}

- (CGFloat)tableView:(UITableView *)tableView heightForRowAtIndexPath:(NSIndexPath *)indexPath 
{
        return 40.0f;
}


- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath
{
    if(indexPath.row == 0)
    {
        static NSString* cellID = @"ID_HeaderBarCell";
 
        HeaderBarCell* cell = (HeaderBarCell*)[tableView dequeueReusableCellWithIdentifier:cellID];
        if (!cell)
        {
            cell = [[HeaderBarCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:cellID];
        }
    
       cell.btnLabel.text = @"Chon ngay";
       [cell.btnBack setTitle:@"<"  forState:UIControlStateNormal];
    
       [cell.btnRight2  setTitle:@"Like"  forState:UIControlStateNormal];
       [cell.btnRight  setTitle:@"Share"  forState:UIControlStateNormal];
    
    [cell setEventBack: ^{
        NSLog(@"Back ");
        [self dismissViewControllerAnimated:YES completion:^{}];
    }];
    [cell setEventRight2: ^{ NSLog(@"Liked "); }];
    [cell setEventRight: ^{ NSLog(@"Shared "); }];
    
        cell.selectionStyle = UITableViewCellSelectionStyleNone;
        return cell;
    }
    
    else 
{
        static NSString* cellID = @"ID_DefaultDataCell";
        
        DefaultDataCell* cell = (DefaultDataCell*)[tableView dequeueReusableCellWithIdentifier:cellID];
        if (!cell)
        {
            cell = [[DefaultDataCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:cellID];
        }
  
        long v = indexPath.row;
        cell.textLabel.text = [NSString stringWithFormat:@"Title %ld", v];
        
        cell.selectionStyle = UITableViewCellSelectionStyleNone;
        return cell;
  
    }
}


- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath 
{
    BookLocationVC* view1 = [[BookLocationVC alloc] init];
    view1.modalTransitionStyle = UIModalTransitionStyleCrossDissolve;
    [self presentViewController:view1 animated:YES completion:^{}];
}


@end
