import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaDiciplinasComponent } from './lista-diciplinas.component';

describe('ListaDiciplinasComponent', () => {
  let component: ListaDiciplinasComponent;
  let fixture: ComponentFixture<ListaDiciplinasComponent>;

  beforeEach(
    async(() => {
      TestBed.configureTestingModule({
        declarations: [ListaDiciplinasComponent]
      }).compileComponents();
    })
  );

  beforeEach(() => {
    fixture = TestBed.createComponent(ListaDiciplinasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
