import { Injectable } from '@angular/core';
import { Motor } from '../model/Motor';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Motard } from '../model/Motard';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json',
    'Accept-Language': 'application/json',
    Authorization:
      'Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjpbIkFETUlOIiwiVVNFUiJdLCJleHAiOjE2NDE5NDEyNTl9.zub8x_3mNhOuxN0BE9v6sR0IZSUfRS0r5B0oaclKl0s',
  }),
};
@Injectable({
  providedIn: 'root',
})
export class MotorService {
  apiURL: string = 'http://localhost:8080/motos/api';
  apiURLMotard: string ='http://localhost:8080/motos/motards';
  MotardsapiURL: string = 'http://localhost:8080/motos/api/motoMotard';
  motoRechecher!: Motor[];

  constructor(private http: HttpClient) {}

  listeMoto(): Observable<Motor[]> {
    return this.http.get<Motor[]>(this.apiURL, httpOptions);
  }

  ajouterMoto(moto: Motor): Observable<Motor> {
    return this.http.post<Motor>(this.apiURL, moto, httpOptions);
  }

  supprimerMoto(id: number) {
    const url = `${this.apiURL}/${id}`;
    return this.http.delete(url, httpOptions);
  }

  consulterMotor(id: number): Observable<Motor> {
    const url = `${this.apiURL}/${id}`;
    return this.http.get<Motor>(url, httpOptions);
  }

  updateMoto(m: Motor): Observable<Motor> {
    return this.http.put<Motor>(this.apiURL, m, httpOptions);
  }

  listeMotard(): Observable<Motard[]> {
    return this.http.get<Motard[]>(this.apiURLMotard, httpOptions);
  }
  
  consulterMotard(id: number): Observable <Motard[]> {
    const url = `${this.apiURLMotard}/${id}`;
    return this.http.get<Motard[]>(url, httpOptions);
  }

  rechercherparMotard(IdMotard:number): Observable<Motor[]>{
    const url = `${this.MotardsapiURL}/${IdMotard}`;
    return this.http.get<Motor[]>(url, httpOptions);
  }
}





/* this.motoRechecher = [];
    this.motards.forEach((cur, index) => {
    if(idCat == cur.categorie.idCat) {
    console.log("cur "+cur);
    this.produitsRecherche.push(cur);
    }
  });
return this.produitsRecherche; */