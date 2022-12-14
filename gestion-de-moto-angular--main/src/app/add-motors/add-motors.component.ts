import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Motard } from '../model/Motard';
import { Motor } from '../model/Motor';
import { MotorService } from '../services/motor.service';

@Component({
  selector: 'app-add-motors',
  templateUrl: './add-motors.component.html',
})
export class AddMotorsComponent implements OnInit {
  newMotor = new Motor();
  motard = new Motard();
  IdMotard ! : number  ;
  message!: string;
  
  newMotard!:Motard [];
  motards!: Motard [];


  constructor(private activatedRoute: ActivatedRoute,private motorService: MotorService, private router: Router) {}

  ngOnInit(): void {

    this.motorService.listeMotard().subscribe(
      (motards) => {
        console.log(motards);
        this.motards = motards;
      },
      (error) => {
        console.log(error);
      });
    }
    onChange(){
    console.log(this.IdMotard);
     this.motorService.consulterMotard(this.IdMotard).subscribe(res => {
      this.newMotor.motard= res;
    });
  }
 

  addMotor() {
    //this.newMotard=  this.motards.find(motard => motard.idMotard == newMotor.motard.idMotard);
    //this.newMotor.motard =  this.motards.find(motard => motard.idmotard == this.motard.idmotard);
    this.motorService.ajouterMoto(this.newMotor).subscribe((moto) => {
      console.log(moto);
      this.router.navigate(['motors']);

    });
  }
}

/* this.newMotard = this.motorService.consulterMotard(motard.nomMotard);
  addMotor(): void {
    //console.log(this.newMotor);
    this.motorService.ajouterMotor(this.newMotor);
    this.message = "Motor "+ this.newMotor.nomMotor + " ajouté avec succés";
    }
*/
