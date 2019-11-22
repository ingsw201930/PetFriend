import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ResultadosAdoptaComponent } from './resultados-adopta.component';

describe('ResultadosAdoptaComponent', () => {
  let component: ResultadosAdoptaComponent;
  let fixture: ComponentFixture<ResultadosAdoptaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ResultadosAdoptaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ResultadosAdoptaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
