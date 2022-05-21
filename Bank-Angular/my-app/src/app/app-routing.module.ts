import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccountComponent } from './account/account.component';
import { HistoryComponent } from './account/history/history.component';
import { AdminInfoComponent } from './admin/admin-info/admin-info.component';
import { AdminComponent } from './admin/admin.component';
import { InfoComponent } from './settings/cust-info/info.component';
import { LoginComponent } from './user/login/login.component';
import { LogoutComponent } from './user/logout/logout.component';
import { SettingsComponent } from './settings/settings.component';
import { NewAccountComponent } from './account/new-account/new-account.component';

const routes: Routes = [
  {path: "adminHome", component: AdminComponent},
  {path: "accountHome", component: AccountComponent},
  {path: "history", component: HistoryComponent},
  {path: "login", component: LoginComponent},
  {path: "logout", component: LogoutComponent},
  {path: "custInfo", component: InfoComponent},
  {path: "adminInfo", component: AdminInfoComponent},
  {path: "settings", component: SettingsComponent},
  {path: "newAccount", component: NewAccountComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
