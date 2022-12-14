import { Observable } from 'rxjs';
import { Motard } from './Motard';

export class Motor {
  idMoto!: number;
  modeleMoto!: string;
  prixMoto!: number;
  dateCreation!: Date;
  motard !: Motard [];
}
