import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Motard } from '../model/Motard';
import { Motor } from '../model/Motor';
import { MotorService } from '../services/motor.service';

@Component({
  selector: 'app-recherche-par-motard',
  templateUrl: './recherche-par-motard.component.html',
  styles: [],
})
export class RechercheParMotardComponent implements OnInit {
  motos!: Motor[];
  motards! : Motard[];
  IdMotard ! : number ;
  constructor(private motorService: MotorService, private router: Router) {}

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
    this.motorService.rechercherparMotard(this.IdMotard).subscribe(res => {
      this.motos= res;
    });
    
  }
}
