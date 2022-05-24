import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Account } from '../account/account.model';
import { AuthService } from './auth.service';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private authService: AuthService, private http:HttpClient) { }
  account: Account ={
    accountId: 0,
    accountName: "",
    accountBalance: 0,
    customerId: 0,
    accountUsername: "",
    accountPassword: ""
  }

  validateAccount(user: Account){
    return this.http.post<Account>("http://localhost:7798/api/login", user);
  }
}
