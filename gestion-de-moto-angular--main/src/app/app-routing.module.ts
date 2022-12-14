import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddMotorsComponent } from './add-motors/add-motors.component';
import { MotorsComponent } from './motors/motors.component';
import { UpdateMotorComponent } from './update-motor/update-motor.component';
import { RechercheParMotardComponent } from './recherche-par-motard/recherche-par-motard.component';
const routes: Routes = [
  {path : "motors" , component : MotorsComponent},
  {path : "add-motor" , component : AddMotorsComponent},
  {path : "updateMotor/:id" , component : UpdateMotorComponent},
  {path: "rechercheParMotard", component : RechercheParMotardComponent},
  {path : "" ,redirectTo : "motors", pathMatch : "full"}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
