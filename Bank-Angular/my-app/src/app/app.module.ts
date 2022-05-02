import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminComponent } from './admin/admin.component';

import { AccountComponent } from './account/account.component';
import { HistoryComponent } from './account/history/history.component';
import { NavigationComponent } from './navigation/navigation.component';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { AdminInfoComponent } from './admin/admin-info/admin-info.component';

@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    AccountComponent,
    HistoryComponent,
    NavigationComponent,
    LoginComponent,
    LogoutComponent,
    AdminInfoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
