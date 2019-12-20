package com.example.demo.shared.infraestructura;

import java.util.List;
import java.util.stream.Collectors;

public interface MapperApiRest <I,O>{

	public I apiConvertirDtoADomain(O o);
	
	public O apiConvertirDomainADto (I i);
	
	public default List<O> apiConvertirrListaDtoParaDominio(List<I> instancias) {
		return instancias.stream().map(o -> apiConvertirDomainADto(o)).collect(Collectors.toList());
	}

	public default List<I> apiConvertirListDominioParaDto(List<O> instancias) {
		return instancias.stream().map(i -> apiConvertirDtoADomain(i)).collect(Collectors.toList());
	}
	
}
