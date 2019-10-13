import { TestBed } from '@angular/core/testing';

import { AnimalCompañiaService } from './animal-compañia.service';

describe('AnimalCompañiaService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AnimalCompañiaService = TestBed.get(AnimalCompañiaService);
    expect(service).toBeTruthy();
  });
});
