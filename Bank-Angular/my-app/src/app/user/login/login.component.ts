import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Account } from 'src/app/account/account.model';
import { AuthService } from '../auth.service';
import { UserService } from '../user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  toggleLogin: boolean = true;
  title: string = "Welcome to Trace of Trinities Online Banking";

  account: Account ={
    accountId: 0,
    accountName: "",
    accountBalance: 0,
    customerId: 0,
    accountUsername:"",
    accountPassword: ""
  }
  errorMessage: String = "";
  constructor(private userService: UserService, private router: Router,
    private authService: AuthService) { }


  validateAccount(){
    this.userService.validateAccount(this.account).subscribe((response) =>{
    sessionStorage.setItem('account', JSON.stringify(response));
    //sessionStorage.setItem('id', JSON.stringify(response.accountId));
    if(response.accountId =0){
      // incorrect login
      this.errorMessage = "Invalid Credentials!";
    }else{
      this.authService.loggedIn = true;
      this.router.navigate(['accountHome'])
    }
    })
    
  }
  ngOnInit(): void {
  }

}
