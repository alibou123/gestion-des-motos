import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Motor } from '../model/Motor';
import { MotorService } from '../services/motor.service';

@Component({
  selector: 'app-motors',
  templateUrl: './motors.component.html',
})
export class MotorsComponent implements OnInit {
  motos!: Motor[];
  
  constructor(private motorService: MotorService, private router :Router) {
    //this.motors = motorService.listeMotor();
  }

  ngOnInit(): void {
    this.motorService.listeMoto().subscribe(
      (motos) => {
        console.log(motos);
        this.motos = motos;
      },
      (error) => {
        console.log(error);
      }
    );
  }

  deleteMoto(moto: Motor) {

    let conf = confirm('Etes-vous sûr de supprimer '+moto.modeleMoto+' ?');
    if (conf)
      this.motorService.supprimerMoto(moto.idMoto).subscribe(() => {
        console.log('moto supprimé');
        this.SuprimerProduitDuTableau(moto);

      });
      
  }
  SuprimerProduitDuTableau(moto : Motor) {
    this.motos.forEach((cur, index) => {
    if(moto.idMoto=== cur.idMoto) {
    this.motos.splice(index, 1);
    }
    });
    }
}