package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.UsuarioDAO;
import com.distribuida.entities.Usuario;

public class PrincipalUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	
	UsuarioDAO UsuarioDAO = context.getBean("UsuarioDAOImpl",UsuarioDAO.class);
	UsuarioDAO UsuarioDAO222 = context.getBean("UsuarioDAOImpl",UsuarioDAO.class);
	UsuarioDAO UsuarioDAO333 = context.getBean("UsuarioDAOImpl",UsuarioDAO.class);
	
	//CRUD
	
	
	add
	Usuario Usuario1 = new Usuario();
	UsuarioDAO.add();
	
	Usuario Usuario2 = new Usuario();
	UsuarioDAO.add(Usuario2);
	
//	//del
//	UsuarioDAO.del();
	
	System.out.println(Usuario.toString());
	
//	//findAll
//			List<Usuario> Usuario = UsuarioDAO.findAll();
//			
//	
//	for (Usuario clientes2 : Usuario) {
//		System.out.println(clientes2.toString());
//	}
//			
//			//findOne
//			//Usuarios Usuario = UsuarioDAO.findOne(1);
////			System.out.println(Usuarios.toString());
	
	Usuario usuario1 = new Usuario(0,"idUsuario","nombre","apellido","fechadenacimiento","cedula","telefono","correo","direccion","genero");
	UsuarioDAO.add(Usuario1);
	System.out.println(UsuarioDAO.findOne(11));

	Usuario usuario3 = new Usuario(11,"idUsuario11","nombre11","apellido11","fechadenacimiento11","cedula11","telefono11","correo11","direccion11","genero11");
	UsuarioDAO.up(Usuario3);
	System.out.println(UsuarioDAO.findOne(11));
	try { UsuarioDAO.del(11); } catch (Exception e) {e.printStackTrace();	}

	for(Usuario usuario:UsuarioDAO.findAll()) {
		System.out.println(usuario.toString());
//		
	}
			
	
	context.close();

}

}