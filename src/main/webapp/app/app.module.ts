import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import './vendor';
import { FirebaseRestDemoV1SharedModule } from 'app/shared/shared.module';
import { FirebaseRestDemoV1CoreModule } from 'app/core/core.module';
import { FirebaseRestDemoV1AppRoutingModule } from './app-routing.module';
import { FirebaseRestDemoV1HomeModule } from './home/home.module';
import { FirebaseRestDemoV1EntityModule } from './entities/entity.module';
// jhipster-needle-angular-add-module-import JHipster will add new module here
import { JhiMainComponent } from './layouts/main/main.component';
import { NavbarComponent } from './layouts/navbar/navbar.component';
import { FooterComponent } from './layouts/footer/footer.component';
import { PageRibbonComponent } from './layouts/profiles/page-ribbon.component';
import { ActiveMenuDirective } from './layouts/navbar/active-menu.directive';
import { ErrorComponent } from './layouts/error/error.component';

@NgModule({
  imports: [
    BrowserModule,
    FirebaseRestDemoV1SharedModule,
    FirebaseRestDemoV1CoreModule,
    FirebaseRestDemoV1HomeModule,
    // jhipster-needle-angular-add-module JHipster will add new module here
    FirebaseRestDemoV1EntityModule,
    FirebaseRestDemoV1AppRoutingModule
  ],
  declarations: [JhiMainComponent, NavbarComponent, ErrorComponent, PageRibbonComponent, ActiveMenuDirective, FooterComponent],
  bootstrap: [JhiMainComponent]
})
export class FirebaseRestDemoV1AppModule {}
