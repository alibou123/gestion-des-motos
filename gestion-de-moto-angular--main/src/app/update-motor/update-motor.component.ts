import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Motor } from '../model/Motor';
import { MotorService } from '../services/motor.service';

@Component({
  selector: 'app-update-motor',
  templateUrl: './update-motor.component.html',
  styles: [
  ]
})
export class UpdateMotorComponent implements OnInit {
  currentMotor = new Motor() ;
  constructor(private activatedRoute: ActivatedRoute, private motorService : MotorService,private router :Router
    ) { }

  ngOnInit(): void {
    this.motorService.consulterMotor(this.activatedRoute.snapshot.params['id']).
    subscribe( moto =>{ this.currentMotor = moto; } ) ;
  }

  updateMoto() {
    this.motorService.updateMoto(this.currentMotor).subscribe(moto => {
    this.router.navigate(['motors']);
    },(error) => { alert("Problème lors de la modification !"); }
    );
    }
}
