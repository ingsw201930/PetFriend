import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PerfilPropioChatsComponent } from './perfil-propio-chats.component';

describe('PerfilPropioChatsComponent', () => {
  let component: PerfilPropioChatsComponent;
  let fixture: ComponentFixture<PerfilPropioChatsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PerfilPropioChatsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PerfilPropioChatsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
