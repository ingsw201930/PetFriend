import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ResultadosServiciosComponent } from './resultados-servicios.component';

describe('ResultadosServiciosComponent', () => {
  let component: ResultadosServiciosComponent;
  let fixture: ComponentFixture<ResultadosServiciosComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ResultadosServiciosComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ResultadosServiciosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
