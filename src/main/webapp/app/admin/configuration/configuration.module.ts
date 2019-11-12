import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FirebaseRestDemoV1SharedModule } from 'app/shared/shared.module';

import { JhiConfigurationComponent } from './configuration.component';

import { configurationRoute } from './configuration.route';

@NgModule({
  imports: [FirebaseRestDemoV1SharedModule, RouterModule.forChild([configurationRoute])],
  declarations: [JhiConfigurationComponent]
})
export class ConfigurationModule {}
