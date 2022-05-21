import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { MatSliderModule } from '@angular/material/slider';
import { MatCommonModule } from '@angular/material/core';
import { MatCardModule } from '@angular/material/card';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatDividerModule } from '@angular/material/divider';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminComponent } from './admin/admin.component';

import { AccountComponent } from './account/account.component';
import { HistoryComponent } from './account/history/history.component';
import { NavigationComponent } from './navigation/navigation.component';
import { LoginComponent } from './user/login/login.component';
import { LogoutComponent } from './user/logout/logout.component';
import { AdminInfoComponent } from './admin/admin-info/admin-info.component';
import { SettingsComponent } from './settings/settings.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NewAccountComponent } from './account/new-account/new-account.component';

@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    AccountComponent,
    HistoryComponent,
    NavigationComponent,
    LoginComponent,
    LogoutComponent,
    AdminInfoComponent,
    SettingsComponent,
    NewAccountComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatSliderModule,
    MatCommonModule,
    MatCardModule,
    MatButtonModule,
    MatIconModule,
    MatDividerModule,

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
