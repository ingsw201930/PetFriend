import { Injectable } from '@angular/core';
import { AnimalCompañia } from '../modelo/animal-compañia';

@Injectable({
  providedIn: 'root'
})
export class AnimalCompañiaService {
  animal: AnimalCompañia;
  urls: any[] = [];
  constructor() { }

  setAnimal(animal: AnimalCompañia) {
    this.animal=animal;
  }
  getAnimal():AnimalCompañia {
    return this.animal;
  }
}
