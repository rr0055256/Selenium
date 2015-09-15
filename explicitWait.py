from selenium import webdriver

from selenium.webdriver.support.ui import WebDriverWait

from selenium.webdriver.support import expected_conditions as EC

from selenium.webdriver.common.by import By

driver = webdriver.Chrome("/usr/lib/chromium-browser/chromedriver")

driver.get("http://www.google.com")

fLocater = "input[name=d]"

try:
	searchField = WebDriverWait(driver,10).until(EC.presence_of_element_located((By.CSS_SELECTOR,fLocater)))
finally:
	driver.quit()