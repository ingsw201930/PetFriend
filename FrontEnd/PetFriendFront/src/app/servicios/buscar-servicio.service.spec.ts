import { TestBed } from '@angular/core/testing';

import { BuscarServicioService } from './buscar-servicio.service';

describe('BuscarServicioService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: BuscarServicioService = TestBed.get(BuscarServicioService);
    expect(service).toBeTruthy();
  });
});
