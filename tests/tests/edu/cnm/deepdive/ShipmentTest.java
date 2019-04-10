package edu.cnm.deepdive;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class ShipmentTest {

  @Deployment
  public static JavaArchive createDeployment() {
    return ShrinkWrap.create(JavaArchive.class)
        .addClass(Shipment.class)
        .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
  }

  @org.junit.Test
  public void getInitiation() {
  }

  @org.junit.Test
  public void setInitiation() {
  }

  @org.junit.Test
  public void getTracking() {
  }

  @org.junit.Test
  public void addTracking() {
  }
}
