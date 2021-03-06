package com.tsi2.streamrain.services.user.implementations;


import com.tsi2.streamrain.bussines.user.interfaces.IDAOUserBussines;
import com.tsi2.streamrain.bussines.user.implementations.DAOUserBussinesImpl;
import com.tsi2.streamrain.context.StremRainDataContextLoader;
import com.tsi2.streamrain.context.StremRainFacadesContextLoader;
import com.tsi2.streamrain.converters.interfaces.IConverter;
import com.tsi2.streamrain.converters.user.UserConverter;

import com.tsi2.streamrain.datatypes.user.UserDto;
import com.tsi2.streamrain.model.Users;
import com.tsi2.streamrain.services.user.interfaces.IUserService;

public class UserServiceImpl implements IUserService{

	public boolean saveUser(UserDto u) {
		IDAOUserBussines daoService = (DAOUserBussinesImpl) StremRainDataContextLoader.contextLoader().getBean("userBussines");
		IConverter userConverter = (UserConverter)StremRainFacadesContextLoader.contextLoader().getBean("userConverter");
		daoService.saveUser((Users)userConverter.deConverter(u));
		return true;
	}
}
