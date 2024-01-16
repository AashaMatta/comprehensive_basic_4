import pytest
from selenium import webdriver
from selenium.webdriver.commom.by import by

@pytest.fixture(scope="session")
def driver():
 driver.webdriver.Chrome()
 driver.maximize_window()
 driver.get("http://the-internet.herokuapp.com/")
 yield driverdriver.quit()