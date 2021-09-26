package com.hrms.hrms.core.adapters.concretes;

import com.hrms.hrms.core.adapters.abstracts.MernisService;
import com.hrms.hrms.entities.concretes.Candidate;
import mernis.KPSPublicLocator;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class MernisServiceAdapter implements MernisService {

    @Override
    public boolean checkIfRealPerson(String idNumber, String firstName, String lastName, int birthYear) throws ServiceException, RemoteException {
        return new KPSPublicLocator().getKPSPublicSoap().TCKimlikNoDogrula(Long.parseLong(idNumber),firstName,lastName,birthYear);
    }
}
