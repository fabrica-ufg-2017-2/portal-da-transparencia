import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaRestaurantsComponent } from './lista-restaurants.component';

describe('ListaRestaurantsComponent', () => {
  let component: ListaRestaurantsComponent;
  let fixture: ComponentFixture<ListaRestaurantsComponent>;

  beforeEach(
    async(() => {
      TestBed.configureTestingModule({
        declarations: [ListaRestaurantsComponent]
      }).compileComponents();
    })
  );

  beforeEach(() => {
    fixture = TestBed.createComponent(ListaRestaurantsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
