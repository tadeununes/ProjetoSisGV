package database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import domain.RML;

public class BD {
	private SQLiteDatabase bd;
	
	public BD(Context context){
		BDCore auxBd = new BDCore(context);
		bd = auxBd.getWritableDatabase();
	}
	
	
	public void inserir(RML rml){
		ContentValues valores = new ContentValues();
		valores.put("pgv", rml.getPGV());
		valores.put("data", rml.getData());


		bd.insert("rml", null, valores);
	}
	
	/*
	public void atualizar(RML rml){
		ContentValues valores = new ContentValues();
		valores.put("pgv", rml.getPGV());
		valores.put("data", rml.getData());
		
		bd.update("rml", valores, "_id = ?", new String[]{""+rml.getIdrml()});
	}
	
	
	public void deletar(RML rml){
		bd.delete("usuario", "_id = "+rml.getIdrml(), null);
	}

	
	public List<RML> buscar(){
		List<RML> list = new ArrayList<RML>();
		String[] colunas = new String[]{"_id", "nome", "email"};
		
		Cursor cursor = bd.query("usuario", colunas, null, null, null, null, "nome ASC");
		
		if(cursor.getCount() > 0){
			cursor.moveToFirst();
			
			do{

				RML u = new RML();
				u.setIdrml(cursor.getLong(0));
				u.setPGV(cursor.getString(1));
				u.setData(cursor.getString(2));
				list.add(u);
				
			}while(cursor.moveToNext());
		}
		
		return(list);
	}
	*/
}
