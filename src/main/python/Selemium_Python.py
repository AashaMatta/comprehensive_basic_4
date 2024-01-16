import pytest
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

from base_page import BasePage

class InternetHerocupp(BasePage):

def verify_checkbox_state(driver, checkbox_name, expected_state):
    checkbox = driver.find_element(By.NAME, checkbox_name)
    assert checkbox.is_selected() == expected_state

def test_page_title(driver):
    driver.get("http://the-internet.herokuapp.com/")
    assert driver.title == "The Internet"

def test_checkboxes(driver):
    driver.find_element(By.LINK_TEXT, "Checkboxes").click()
    assert WebDriverWait(driver, 10).until(
        EC.presence_of_element_located((By.TAG_NAME, "h3"))
    ).text == "Checkboxes"

    verify_checkbox_state(driver, "checkbox1", False)
    verify_checkbox_state(driver, "checkbox2", True)

def test_file_upload(driver):
    driver.get("http://the-internet.herokuapp.com/")
    driver.find_element(By.LINK_TEXT, "File Upload").click()
    assert WebDriverWait(driver, 10).until(
        EC.presence_of_element_located((By.TAG_NAME, "h3"))
    ).text == "File Uploader"

    file_input = driver.find_element(By.ID, "file-upload")
    file_input.send_keys("/path/to/your/file.txt")  # Replace with your file path
    driver.find_element(By.ID, "file-submit").click()
