import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PerfilPropioComponent } from './perfil-propio.component';

describe('PerfilPropioComponent', () => {
  let component: PerfilPropioComponent;
  let fixture: ComponentFixture<PerfilPropioComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PerfilPropioComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PerfilPropioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
