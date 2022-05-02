import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccountComponent } from './account/account.component';
import { HistoryComponent } from './account/history/history.component';
import { AdminInfoComponent } from './admin/admin-info/admin-info.component';
import { AdminComponent } from './admin/admin.component';
import { InfoComponent } from './cust-info/info.component';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';

const routes: Routes = [
  {path: "adminHome", component: AdminComponent},
  {path: "AccountHome", component: AccountComponent},
  {path: "history", component: HistoryComponent},
  {path: "login", component: LoginComponent},
  {path: "logout", component: LogoutComponent},
  {path: "custInfo", component: InfoComponent},
  {path: "adminInfo", component: AdminInfoComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
