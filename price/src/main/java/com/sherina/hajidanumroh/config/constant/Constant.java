package com.sherina.hajidanumroh.config.constant;

public class Constant {
    public static final class Price {
        public static final String INSERT_DATA = "INSERT INTO tbPrice (priceUid, price, productName, productUid) values (?, ?, ?, ?)";
        public static final String UPDATE_BY_ID = "UPDATE tbPrice set price = ?, productUid = ?, productName = ? where priceUid = ?";
        public static final String DELETE_BY_ID = "DELETE FROM tbPrice where priceUid = ?";
        public static final String GET_ALL = "Select * from tbPrice";
        public static final String GET_BY_ID = "Select * from tbPrice where priceUid = ?";
    }

        public static final class MappingRoleService {
            public static final String INSERT_DATA = "INSERT INTO tbMappingRoleService (mappingUid, roleUid, serviceUid, status, permission) values (?, ?, ?, ?, ?)";
            public static final String UPDATE_BY_ID = "UPDATE tbMappingRoleService set roleUid = ?, serviceUid = ?, status = ?, permission = ? where mappingUid = ?";
            public static final String DELETE_BY_ID = "DELETE FROM tbMappingRoleService where mappingUid = ?";
            public static final String GET_ALL = "SELECT * FROM tbMappingRoleService";
            public static final String GET_BY_ID = "SELECT * FROM tbMappingRoleService WHERE mappingUid = ?";
        }
}
