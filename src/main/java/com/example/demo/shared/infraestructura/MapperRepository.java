package com.example.demo.shared.infraestructura;

import java.util.List;
import java.util.stream.Collectors;

public interface MapperRepository <I,O>{

	public I convertirDtoADomain(O o);
	
	public O convertirDomainADto (I i);
	
	public default List<O> convertirListDominioParaDto(List<I> instancias) {
		return instancias.stream().map(o -> convertirDomainADto(o)).collect(Collectors.toList());
	}

	public default List<I> convertirListaDtoParaDominio(List<O> instancias) {
		return instancias.stream().map(i -> convertirDtoADomain(i)).collect(Collectors.toList());
	}
	
}
