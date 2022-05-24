import { Injectable } from '@angular/core';
import { Account } from '../account/account.model';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  loggedIn: boolean = false;
  constructor() { }

  storeAccount(account:Account): void{
    sessionStorage.setItem("accountInfo", JSON.stringify(account))
  }

  retrieveAccount(): Account{
    let data: any = sessionStorage.getItem("accountInfo");
    return JSON.parse(data);
  }
  destroyAccount(): void{
    sessionStorage.removeItem("accountInfo");
  }
}
