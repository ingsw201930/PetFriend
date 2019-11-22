import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ResultadosEncontrarComponent } from './resultados-encontrar.component';

describe('ResultadosEncontrarComponent', () => {
  let component: ResultadosEncontrarComponent;
  let fixture: ComponentFixture<ResultadosEncontrarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ResultadosEncontrarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ResultadosEncontrarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
