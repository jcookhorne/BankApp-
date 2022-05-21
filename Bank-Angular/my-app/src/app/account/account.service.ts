import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Account } from './account.model';

@Injectable({
  providedIn: 'root'
})
export class AccountService {
  accountId: Number | undefined;
  constructor(private http: HttpClient) { }
retrieveId() : any{
  let id = sessionStorage.getItem("id");
}


  accountview(accountId: number =(this.retrieveId())){
    return this.http.get<Account>("http://localhost:7798/api/account-view/"+ accountId);
  }

  addNewAccount(account: Account): Observable<Account>{
    return this.http.post<Account>("http://localhost:7798/api/account-add", account);
  }

}
