import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Account } from './account.model';

@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.scss']
})
export class AccountComponent implements OnInit {

  account: Account={
    accountId: 0,
    accountName: "",
    accountBalance: 0,
    customerId: 0,
    accountUsername: "",
    accountPassword: ""
  }
  constructor(private router: Router) { }

  navigate(){
    this.router.navigate(["newAccount"]);
  }
  ngOnInit(): void {
  }

}
