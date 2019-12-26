package com.example.demo.infraestructura.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.domain.model.Factura;
import com.example.demo.infraestructura.dto.FacturaDto;
import com.example.demo.infraestructura.restdto.FacturaRestDto;
import com.example.demo.shared.domain.Codigo;
import com.example.demo.shared.domain.Nombre;
import com.example.demo.shared.domain.Valor;
import com.example.demo.shared.infraestructura.MapperApiRest;
import com.example.demo.shared.infraestructura.MapperRepository;

@Component
public class FacturaMapper implements MapperRepository<Factura, FacturaDto>, MapperApiRest<Factura, FacturaRestDto>{

	@Autowired
	CancionMapper cancionMapper;
	
	@Autowired
	AlbumMapper albumMapper;
	
	@Override
	public Factura apiConvertirDtoADomain(FacturaRestDto o) {
		return Factura.of(new Codigo(o.getCodigo()), new Nombre(o.getComprador()), cancionMapper.convertirListaDtoParaDominio(o.getCanciones()), albumMapper.convertirListaDtoParaDominio(o.getAlbumes()), new Valor(o.getValorFactura()));
	}

	@Override
	public FacturaRestDto apiConvertirDomainADto(Factura i) {
		FacturaRestDto factura = new FacturaRestDto(i.getCodigo().getValue(), i.getComprador().getValue(), albumMapper.convertirListDominioParaDto(i.getAlbumes()),
				cancionMapper.convertirListDominioParaDto(i.getCanciones()), i.getValorFactura().getValue());
		
		return factura;
	}

	@Override
	public Factura convertirDtoADomain(FacturaDto o) {
		return Factura.of(new Codigo(o.getCodigo()), new Nombre(o.getComprador()), cancionMapper.convertirListaDtoParaDominio(o.getCanciones()), albumMapper.convertirListaDtoParaDominio(o.getAlbumes()), new Valor(o.getValorFactura()));
	}

	@Override
	public FacturaDto convertirDomainADto(Factura i) {
		FacturaDto factura = new FacturaDto();
		factura.setCodigo(i.getCodigo().getValue());
		factura.setComprador(i.getComprador().getValue());
		factura.setAlbumes(albumMapper.convertirListDominioParaDto(i.getAlbumes()));
		factura.setCanciones(cancionMapper.convertirListDominioParaDto(i.getCanciones()));
		factura.setValorFactura(i.getValorFactura().getValue());
		
		return factura;
	}

}
