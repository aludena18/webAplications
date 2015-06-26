package com.aludena.mtkweb.dao;

import java.util.ArrayList;

import com.aludena.mtkweb.getset.DatosTramaGetSet;

public interface IfaceConsulta {
	ArrayList<DatosTramaGetSet> consultaLista(String i, String fd, String fh);
}
