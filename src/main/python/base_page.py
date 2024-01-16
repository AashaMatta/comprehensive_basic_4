class BasePage:

def __init__(self, driver):
  self.driver = driver


def switch_to_new_window(self):
handles = self.driver.window_handles
self.driver.switch_to.window(handles[-1])