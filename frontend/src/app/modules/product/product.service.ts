import { Injectable } from '@angular/core';
import { Product } from './model/product';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class ProductService {
  constructor(private http: HttpClient) {}

  getProducts(): Observable<Product[]> {
    return this.http.get<Product[]>("/api/products");
    // return [
    //   {
    //     name: 'Product 1',
    //     category: 'Category 1',
    //     description: 'Product description 1',
    //     price: 11.99,
    //     currency: 'USD',
    //   },
    //   {
    //     name: 'Product 2',
    //     category: 'Category 2',
    //     description: 'Product description 2',
    //     price: 11.99,
    //     currency: 'USD',
    //   },
    //   {
    //     name: 'Product 3',
    //     category: 'Category 3',
    //     description: 'Product description 3',
    //     price: 11.99,
    //     currency: 'USD',
    //   },
    // ];
  }
}
