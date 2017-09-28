/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inlämningsuppgift01;

import java.util.List;

/**
 *
 * @author ägare
 */
public interface IDjur {
     public String getName();
     public double getVikt();
     public boolean ärDjur();
     public List<Djur> getAllDjur();
}
